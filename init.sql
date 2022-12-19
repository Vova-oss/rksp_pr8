insert into pr8_car(model, price) VALUES ('Ferarry', '9999'), ('BMW','1111');

insert into pr8_people(age,"name") values (10, 'Vova'), (20, 'Misha'), (30, 'Kolya');


docker-compose up eureka-server dbpeople dbcar -d
docker-compose up car-client people-client feign-client -d
docker-compose up api-gateway -d