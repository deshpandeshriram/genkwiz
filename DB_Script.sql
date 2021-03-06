-- Database for genkwiz.com
create database genkwiz;

-- Purpose:Consists of information about the various modes provided in the application.
create table question_mode(
id bigserial not null,
mode_name varchar not null,
max_time int not null,
max_score int not null,
primary key (id)
);

-- Purpose:Consists of all the questions available for the multiple types of quizzes.
create table question_bank(
id bigserial not null,
question text not null,
genre varchar not null,
mode_id int not null,
ratings float default 0.0,
type varchar (10) not null,
primary key (id),
foreign key(mode_id) references question_mode(id)
);

create index index_question_bank on question_bank (genre , mode_id);

-- Purpose:Consists of all information about the hints available for individual questions.
create table question_hint(
id serial not null,
question_id int not null,
hint_number int not null,
value text not null,
marks_deduction int,
primary key (id),
foreign key (question_id) references question_Bank(id)
);

create index index_question_hint on question_hint (question_id , hint_number);

-- Purpose:Consists of all information about the multimedia available for individual questions.
create table multimedia(
id uuid not null,
link text not null,
primary key (id),
foreign key (question_id) references question_bank(id)
);

create index index_multimedia on multimedia (question_id , multimedia_number);

-- Purpose:Consists of a set of correct answers for subjective questions.
create table subjective_answer(
id bigserial not null,
question_id int not null,
answer_value text not null,
primary key (id),
foreign key (question_id) references question_bank(id)
);

create index index_subjective_answer on subjective_answer (question_id , answer_value);

-- Purpose:Consists of a set of correct answers for multiple choice questions.
create table mcq_answer(
id bigserial not null,
question_id int not null,
answer_number int not null,
answer_value varchar not null,
is_correct_ans varchar(6) not null,
primary key (id),
foreign key (question_id) references question_bank(id)
);

create index index_mcq_answer on mcq_answer (question_id , answer_number);

-- creation of uuid for quiz table

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create type status as enum('ATTEMPTED', 'NOT_ATTEMPTED', 'SKIPPED');

-- Purpose: Consists information about quizzes to be generated.
create table quiz_question_state(
quiz_id uuid not null,
id int not null,
time_taken_by_user int default 0,
hints_used int default 0,
score int default 0,
status status default 'NOT_ATTEMPTED',
is_correct boolean,
user_answer varchar,
serial_number integer  
);

create index index_quiz on quiz (id , score);

-- Purpose: Consists information about performance parameters to evaluate users.
create table performance(
id integer not null,
quiz_id uuid not null,
no_of_attempted int not null,
no_of_correct_ans int default 0,
final_score int default 0,
start_time timestamp not null,
end_time timestamp not null,
quiz_status varchar, 
total_time_taken int not null
);


-- Purpose: Consists information about available avatars for user. No longer needed for version 1
create table avatar(
id serial not null,
avatar_name varchar not null,
content bytea not null,
avatar_type varchar not null,
primary key(id)
);

-- Purpose: Consists information about user's profile on genkwiz.com
create table user(
id uuid not null,
user_name varchar not null,
avatar_id varchar not null,
);


-- Purpose: Consists information about user's quiz history on genkwiz.com
create table user_session(
user_id uuid not null,
quiz_id uuid not null
);
