create table car
(
	id int,
	model varchar(255) unique not null,
	door_number int not null,
	transmission varchar(255) not null,
	availability varchar(255) not null,
	price_per_hour int not null,
	fuel_type varchar(255) not null,
	seats int not null,

	primary key (id)
);

create table number_plate
(
  id int constraint number_plate_pk primary key,
  number_plate_value varchar(255) unique not null,
  car_id int,
  constraint car_fk foreign key (car_id)
  references car (id)
);



create sequence car_seq;
create sequence number_plate_seq;