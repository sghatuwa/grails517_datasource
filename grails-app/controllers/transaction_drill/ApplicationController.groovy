package transaction_drill

class ApplicationController {
    def applicationService

    def index(){
        applicationService.defaultDB()
        render "DefaultDB"
    }

    def defaultDB() {
        applicationService.defaultDB()
        render "DefaultDB"
    }

    def rds() {
        applicationService.rdsDB()
        render "rdsDB"
    }

    def mariaDB() {
        applicationService.mariaDB()
        render "mariaDB"
    }
}
