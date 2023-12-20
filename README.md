Default DataSource Issue
---
Grails: 5.1.x

JDK: 1.8

Gradle: 7.4

Open grails-app/conf/application.yml

Update DB Host URL, Database name, username and password.
> Create the client table having id and name column.

You can use same database and data source.

Testing:
---

Run the application:
http://localhost:8080/application/defaultDB
> This will hit table of default datasource DB

http://localhost:8080/application/rdsDB
> This will hit table of non default datasource (i.e. rds datasource)

http://localhost:8080/application/mariaDB
> This will hit table of non default datasource (i.e. maria datasource)
