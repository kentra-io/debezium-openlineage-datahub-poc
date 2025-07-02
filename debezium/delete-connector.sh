#!/bin/sh
curl -X DELETE http://localhost:8083/connectors/postgres-connector
echo "Connector deleted successfully."