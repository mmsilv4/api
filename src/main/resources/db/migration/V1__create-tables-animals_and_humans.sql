create table animals(

    animal_cod serial primary key,
    name varchar(100) not null,
    animalType varchar(100) not null,
    breed varchar(100),
    color varchar(100),
    gender varchar(100),
    age varchar(100)
);

create table humans(

    id serial primary key,
    name varchar(100) not null,
    cpf character varying(11) not null,
    animal_cod serial,
    foreign key(animal_cod) references animals(animal_cod),
    email varchar(100) not null,
    phone varchar(15) not null,
    street varchar(100) not null,
    number varchar(20) not null,
    district varchar(100) not null,
    city varchar(100) not null,
    postCode varchar(9) not null,
    country varchar(100) not null
);