"# microservice-ribbon-eureka-demo" 
# stockservice
Get quotes by stock code. 

# orderservice
Call the stockservice to get quote and place an order.

# eureka-naming-server
An instance of Eureka naming server. All services can register here.

Starts two instance of stockservice, one on 8000 (default port in property file), aonther on 8001, use -Dserver.port=8001.

Starts one instance of orderservice on 9000.


Post some requests to http://localhost:9000/api/order
```json
{
    "price": 20,
    "amount": 1,
    "buyOrSell": "B",
    "code": "600003"
}
```

It will call stockservice in round robin manner by default. response:
```json
{
    "id": 5,
    "price": 20,
    "amount": 1,
    "buyOrSell": "B",
    "code": "600003",
    "createdDate": "2018-11-27T22:44:26.569+0000",
    "status": "Pending"
}
```
