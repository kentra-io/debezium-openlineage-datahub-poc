Debezium - Openlineage - DataHub POC

How to run:
1. Start the Docker containers 
```bash
   docker-compose up -d
```
   
2. Register the postgres connector in Debezium
```bash
   cd debezium
   ./register-connector.sh
```

3. Start the Java applicaiton
```bash
   cd java-db-producer
   ./gradlew bootRun
```
