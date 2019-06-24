# notification-system
It has two mirco service 
1) notification-service
2) notification-sender

Install and run ActiveMQ

For both service
`mvn clean install`
`mvn spring-boot:run`

In browser : open : http://localhost:8080/notification/swagger-ui.html

go to notification-controller and try send :
Choose "channel" attribute in JSON payload to send properchannel 
Correct values are : "EMAIL" or "SLACK".

After successfully send go to ActiveMQ admin
http://0.0.0.0:8161/admin/
Click on "Queues" :
You can see you notification consumed queues : "email-queue"/ "slack-queue"



