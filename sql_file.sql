create database CarCompany;

use CarCompany;

create table  users(
    user_id int primary key auto_increment,
    username nvarchar(50),
    password nvarchar(50),
    email nvarchar(50),
    address nvarchar(50),
    permission_id int,
    constraint PERMISSION_FK foreign key(permission_id) references permission_table(permission_id)
# foreign key(permission_id) references permission_table(permission_id)
);
alter table users
modify column password nvarchar(50) not null, modify column address nvarchar(200) not null;

alter table permission_table
change column permission_name permission_type nvarchar(10);


create table car_image_table(
    image_id int primary key auto_increment,
    image1 nvarchar(200),
    image2 nvarchar(200),
    image3 nvarchar(200),
    image4 nvarchar(200),
    image5 nvarchar(200),
    image6 nvarchar(200),
    image8 nvarchar(200),
    image9 nvarchar(200),
    image10 nvarchar(200)
);

create table permission_table(
    permission_id int primary key auto_increment,
    permission_name nvarchar(10) not null unique
);

insert into permission_table(permission_name) values('users'),
                                                     ('admin'),('guest');

select * from permission_table;

create table valves_table(
    valves_id int auto_increment primary key,
    valves_type nvarchar(100) not null
);

insert into valves_table(valves_type) values('6 speed'),('5 speed'),('4 speed');

select * from valves_table;
create table fuel_type_table(
        fuel_type_id int primary key auto_increment,
        fuel_type_name nvarchar(100) not null
);

insert into fuel_type_table(fuel_type_name) values('gasoline'),('diesel'),( 'liquefied'), ('petroleum'),('compressed'),('natural gas'), ('ethanol');
select * from fuel_type_table;

create table front_wheel_table(
    front_wheel_id int primary key auto_increment,
    front_wheel_name nvarchar(100) not null
);

insert into front_wheel_table(front_wheel_name) values('fwd'),('rwd'),('awd');

create table gear_table(
    gear_id int primary key auto_increment,
    gear_name nvarchar(100)
);
insert into gear_table(gear_name)
values('mt'),('at'),('cvt'),('dct');

select * from gear_table;

create table engine_type_table(
    engine_type_id int primary key auto_increment,
    engine_type_name nvarchar(100)
);

insert into engine_type_table(engine_type_name) values('twin-cylinder'),('three-cylinder'),('four-cylinder');

select * from engine_type_table;

create table car(
    car_id int primary key auto_increment,
    user_id int not null ,
    image_id int not null ,
    engine_type_id int,
    gear_id int,
    front_wheel_id int,
    fuel_type_id int,
    valves_id int,
    car_price double,
    description nvarchar(5000),
    torque nvarchar(500),
    power nvarchar(500),
    foreign key (user_id) references users(user_id),
    foreign key (image_id) references car_image_table(image_id),
    foreign key(engine_type_id) references engine_type_table(engine_type_id),
    foreign key(gear_id) references gear_table(gear_id),
    foreign key(front_wheel_id) references front_wheel_table(front_wheel_id),
    foreign key(fuel_type_id) references fuel_type_table(fuel_type_id),
    foreign key(valves_id) references valves_table(valves_id)
);

create table orders(
    order_id int primary key auto_increment,
    user_id int ,
    order_date date,
    shipped_date date,
    foreign key(user_id) references users(user_id)
);

create table order_detail(
    order_detail_id int primary key auto_increment,
     order_id int references orders(order_id),
     seller_id int references users(user_id),
     car_id int references car(car_id),
     quantity int,
     price_manual double
);