package com.dym.elasticsearch.service;

import com.dym.elasticsearch.Pojo.RecordSalesDetails;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends ElasticsearchRepository<RecordSalesDetails,String> {

    /**
     * 查询雇员信息
     * @param id
     * @return
     */
    RecordSalesDetails queryEmployeeById(String id);
}