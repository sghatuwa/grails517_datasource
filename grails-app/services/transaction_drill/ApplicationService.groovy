package transaction_drill

import grails.gorm.transactions.Transactional
import groovy.sql.Sql

@Transactional
class ApplicationService {

    def dataSource
    def dataSource_rds
    def dataSource_maria

    def defaultDB() {
        try {
            Sql sql = Sql.newInstance(dataSource)
            def sqlQuery = "SELECT id, name FROM client"
            def result = sql.rows(sqlQuery)
            println "result = "+result.size()
        } catch (Exception ex){
            ex.printStackTrace()
        }
    }

    def rdsDB() {
        try {
            Sql sql = Sql.newInstance(dataSource_rds)
            def sqlQuery = "SELECT id, name FROM client"
            def result = sql.rows(sqlQuery)
            println "result = "+result.size()
        } catch (Exception ex){
            ex.printStackTrace()
        }
    }

    def mariaDB() {
        try {
            Sql sql = Sql.newInstance(dataSource_maria)
            def sqlQuery = "SELECT id, name FROM client"
            def result = sql.rows(sqlQuery)
            println "result = "+result.size()
        } catch (Exception ex){
            ex.printStackTrace()
        }
    }
}
