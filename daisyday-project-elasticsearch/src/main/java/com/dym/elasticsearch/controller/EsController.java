package com.dym.elasticsearch.controller;

import com.alibaba.fastjson.JSONObject;
import com.dym.elasticsearch.Pojo.RecordSalesDetails;
import com.dym.elasticsearch.service.EmployeeRepository;
import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.index.query.MatchPhraseQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLDecoder;
import java.util.Date;

@RestController

public class EsController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @RequestMapping(value = "/q")
    public JSONObject sendBillEmail() {
        JSONObject res = new JSONObject();
        res.put("info", "success");
        return res;

    }

    /**
     * 查询
     *
     * @return
     */
    @RequestMapping("query")
    public RecordSalesDetails query() {
        try {
            RecordSalesDetails accountInfo = employeeRepository.queryEmployeeById("e257d43b8452452cb7ea07ff66b7504a");
            System.err.println(new Gson().toJson(accountInfo));
            return accountInfo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询
     *
     * @return
     */
    @RequestMapping("add")
    public RecordSalesDetails add() {
        try {


            RecordSalesDetails accountInfo =new RecordSalesDetails();
            accountInfo.setId("1");
            accountInfo.setBarCode("asdfasdf");
            accountInfo.setCreateDate(new Date());
            RecordSalesDetails save = employeeRepository.save(accountInfo);
            return save;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 查询
     *
     * @return
     */
    @RequestMapping("query1")
    public RecordSalesDetails query1() {
        try {


            String documentId = "b761417ad71c47b39460b854a0ca834b";
            RecordSalesDetails sampleEntity = new RecordSalesDetails();
            sampleEntity.setId(documentId);


            SearchQuery query;
            String q = "b761417ad71c47b39460b854a0ca834b";
            if (StringUtils.isNotBlank(q)) {
                q = URLDecoder.decode(q, "UTF-8");
            }
            MatchPhraseQueryBuilder mpq1 = QueryBuilders
                    .matchPhraseQuery("id", q);

            elasticsearchTemplate.query(null, null);
            IndexQuery indexQuery = new IndexQueryBuilder().withId(sampleEntity.getId()).withObject(sampleEntity).build();
            elasticsearchTemplate.index(indexQuery);

            RecordSalesDetails accountInfo = employeeRepository.queryEmployeeById("b761417ad71c47b39460b854a0ca834b");
            System.err.println(new Gson().toJson(accountInfo));
            return accountInfo;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }

}
