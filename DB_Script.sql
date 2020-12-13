
create database db_setup;

create table que_mode(
id bigserial not null,
mode_name varchar not null,
max_time time not null,
max_score int not null,
primary key (id)
);

create table question_bank(
id bigserial NOT NULL  ,
q_question text not null,
q_genre varchar not null,
mode_id int not null,
q_ratings float default 0.0,
q_type varchar (10) not null,
primary key (id),
foreign key(mode_id)references que_mode(id)	
);

create index idx_quebank on question_bank (q_genre , mode_id);

create table que_hint(
id serial not null  ,
q_id int not null,
hint_number int not null,
hint_value text not null,
marks_deduction int, 
h_multimedia bytea,
h_multitype varchar,
primary key (id),
foreign key (q_id) references Question_Bank(id)
);

create index idx_quehint on que_hint (q_id , hint_number);

create table multimedia(
id serial not null    ,
q_id int not null,
m_number int not null,
m_multitype varchar not null,
q_multimedia bytea not null,
primary key (id),
foreign key (q_id) references Question_Bank(id)
);

create index idx_multimedia on multimedia (q_id , m_number);

create table subjective_answer(
id bigserial not null,
q_id int not null,
sans_value text not null,
primary key (id),
foreign key (q_id) references Question_Bank(id)
);

create index idx_subjective_answer on subjective_answer (q_id , sans_value);

create table mcq_answer(
id bigserial not null   ,
q_id int not null,
mans_number int not null,
mans_value varchar not null,
is_correct_ans varchar(6) not null,
primary key (id),
foreign key (q_id) references Question_Bank(id)
);

create index idx_mcq_answer on mcq_answer (q_id , mans_number);

create table quiz(
id int not null,
q_id int not null,
time_taken_by_user time not null,
hints_used int  default 0,
score_per_question int  default 0,
is_attempted varchar (6) not null
);

create index idx_quiz on quiz (q_id , score_per_question);

create table performance(
id serial not null   ,
user_id varchar not null,
quiz_id int not null,
no_of_attempted int not null,
no_of_correct_ans int default 0,
final_score int default 0,
start_time timestamp not null,
end_time timestamp not null,
total_time_taken timestamp not null,
primary key (id)
);




