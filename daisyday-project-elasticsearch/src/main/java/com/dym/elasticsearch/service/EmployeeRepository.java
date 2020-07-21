package com.dym.elasticsearch.service;

import com.dym.elasticsearch.Pojo.RecordSalesDetails;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeRepository extends ElasticsearchRepository<RecordSalesDetails,String> {

    /**
     * 查询雇员信息
     * @param id
     * @return
     */
    RecordSalesDetails queryEmployeeById(String id);

    <S extends RecordSalesDetails> Iterable<S> saveAll(Iterable<S> entities);

    <S extends RecordSalesDetails> S save(S entity);

    <S extends RecordSalesDetails> List<S> save(List<S> entities);


}