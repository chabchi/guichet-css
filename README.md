# guichet-css
to start kafka broker use: 

docker-compose up -d


post curl example:
curl --location --request POST 'http://localhost:8080/STM' \
--header 'Content-Type: application/json' \
--data-raw '{
    "ticketNumber":"321chaise",
    "user":"chiheb",
    "mail": "chiheb.ads@gmail.com"
}'

get curl example:
