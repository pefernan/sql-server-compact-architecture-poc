PROTOCOL=http
HOST=127.0.0.1
PORT=8080
CONTEXT=hiring
CONCURRENT_REQUESTS=10
TOTAL_REQUESTS=1000

APPURL=${PROTOCOL}://${HOST}:${PORT}/${CONTEXT}

# create process instance
echo "{\"candidateData\": { \"name\": \"Jon\", \"lastName\": \"Snow\", \"email\": \"jon@snow.org\", \"experience\": 5, \"skills\": [\"Java\", \"Kogito\", \"Fencing\"]}}" > payload.json
echo Load testing  ${APPURL} with payload `cat payload.json`
echo Concurrency ${CONCURRENT_REQUESTS}
echo Total number of requests ${TOTAL_REQUESTS}

# load test
ab -c ${CONCURRENT_REQUESTS} -n ${TOTAL_REQUESTS} -H 'Content-Type: application/json' -T 'application/json' -p payload.json ${APPURL}