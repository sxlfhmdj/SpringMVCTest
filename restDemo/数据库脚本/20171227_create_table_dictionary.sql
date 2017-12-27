drop table if exists dictionary;

/*==============================================================*/
/* Table: dictionary                                            */
/*==============================================================*/
create table dictionary
(
   id                   bigint(20) not null comment 'ID',
   pid                  bigint(20) comment '父ID',
   name                 varchar(255) comment '名称',
   code                 varchar(512) comment '编码',
   val                  varchar(0) comment '值',
   description          varchar(512) comment '描述信息',
   del_flag             tinyint(1) not null comment '删除标记',
   sort_no              int comment '排序标记',
   primary key (id)
);

alter table dictionary comment '字典表';
