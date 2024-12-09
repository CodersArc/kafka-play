# kafka101-simple

## Kafka setup using KRaft controller instead of zookeeper

## Add grafana and prometheus for observability

## Simple producer and consumer java gradle projects

Producer is a simple rest controller, you can trigger it by invoking a simple curl like this

```
curl -X POST "http://localhost:8080/api/send?message=key:this%20is%20a%20test%20message,%20hello%20world"
```

Consumer is also very simple, it simply prints the message from its listener on the topic called `my-topic-1`.

I will add more details as I go through more advanced concepts. More complex message structures that require defining a schema etc.
