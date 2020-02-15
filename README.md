# spring-session-with-redis



A simple Spring Boot Application demonstrating integration of Redis as session storage. By default Redis stores spring session 
in encoded format. To store data in simple format we just have to update default spring session redis serializer 
to "GenericJackson2JsonRedisSerializer".
