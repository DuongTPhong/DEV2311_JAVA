package com.vn.devmaster.service.demo.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Connect {
    @Autowired
    private ISql iSql;

    public ISql getiSql() {
        return iSql;
    }
}
