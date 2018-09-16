create table car
(
	id int constraint car_pk primary key,
	model varchar(255) not null,
	doorNumber int not null,
	transmission varchar(255) not null,
	numberPlate varchar(255) unique not null,
	availability varchar(255) not null,
	pricePerHour int not null,
	fuelType varchar(255) not null,
	seats int not null

);

create sequence car_seq;