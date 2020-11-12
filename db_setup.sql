//Database setup script

// all sequence are created to give serial numbering to column. and indexes for getting faster in fetching process.

// created mode table which contains various mode of a quiz.

create sequence quemode start 1 increment 1 minvalue 1 ;

create table Que_Mode(
mode_id int not null  DEFAULT nextval('quemode'::regclass)  ,
mode_name varchar not null,
max_time time not null,
max_score int not null,
primary key (mode_id)
);



// created Question_Bank table which store all the questions.

create sequence quebank start 1 increment 1 minvalue 1 ;

create table Question_Bank(
q_id int  NOT NULL  DEFAULT nextval('quebank'::regclass)  ,
q_question text not null,
q_genre varchar not null,
mode_id int not null,
q_ratings float default 0.0,
q_type varchar not null,
primary key (q_id),
foreign key(mode_id)references Que_Mode(mode_id)	
);

create index idx_quebank on question_bank (q_genre , mode_id);



//It is hint table to store question related hints.

create sequence queshint start 1 increment 1 minvalue 1 ;

create table Que_Hint(
hint_id int not null  DEFAULT nextval('queshint'::regclass)  ,
q_id int not null,
hint_number int not null,
hint_value text not null,
marks_deduction int, 
h_multimedia bytea,
h_multitype varchar,
primary key (hint_id),
foreign key (q_id) references Question_Bank(q_id)
);

create index idx_quehint on que_hint (q_id , hint_number);



//created multimedia table.

create sequence multi start 1 increment 1 minvalue 1 ;

create table Multimedia(
multi_id int not null  DEFAULT nextval('multi'::regclass)  ,
q_id int not null,
m_number int not null,
m_multitype varchar not null,
q_multimedia bytea not null,
primary key (multi_id),
foreign key (q_id) references Question_Bank(q_id)
);

create index idx_multimedia on multimedia (q_id , m_number);




//Subjective_Answer table to store answers.

create sequence subjective_ans start 1 increment 1 minvalue 1 ;

create table Subjective_Answer(
sans_id int not null  DEFAULT nextval('subjective_ans'::regclass)  ,
q_id int not null,
sans_value text not null,
primary key (sans_id),
foreign key (q_id) references Question_Bank(q_id)
);

create index idx_subjective_answer on subjective_answer (q_id , sans_value);





//Mcq_Answer table to store answer of mcq question.

create sequence mcq_ans start 1 increment 1 minvalue 1 ;

create table Mcq_Answer(
mans_id int not null  DEFAULT nextval('mcq_ans'::regclass)  ,
q_id int not null,
mans_number int not null,
mans_value varchar not null,
is_correct_ans varchar not null,
primary key (mans_id),
foreign key (q_id) references Question_Bank(q_id)
);

create index idx_mcq_answer on mcq_answer (q_id , mans_number);





// created Quiz table to store quiz info.

create table Quiz(
quiz_id int not null,
q_id int not null,
time_taken_by_user time not null,
hints_used int  default 0,
score_per_question int  default 0,
is_attempted varchar not null
);

create index idx_quiz on quiz (q_id , score_per_question);





// performance table to calculate performance.

create sequence seq_performance start 1 increment 1 minvalue 1 ;

create table Performance(
performance_id int not null  DEFAULT nextval('seq_performance'::regclass)  ,
user_id varchar not null,
quiz_id int not null,
no_of_attempted int not null,
no_of_correct_ans int default 0,
final_score int default 0,
start_time timestamp not null,
end_time timestamp not null,
total_time_taken timestamp not null,
primary key (performance_id)
);




