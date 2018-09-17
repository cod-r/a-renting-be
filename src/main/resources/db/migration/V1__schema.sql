create table car
(
	id int constraint car_pk primary key,
	model varchar(255) not null,
	door_number int not null,
	transmission varchar(255) not null,
	number_plate varchar(255) unique not null,
	availability varchar(255) not null,
	price_per_hour int not null,
	fuel_type varchar(255) not null,
	seats int not null

);

create sequence car_seq;