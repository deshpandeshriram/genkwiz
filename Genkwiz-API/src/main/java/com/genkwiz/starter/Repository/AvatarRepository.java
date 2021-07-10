package com.genkwiz.starter.Repository;

import org.springframework.data.repository.CrudRepository;

import com.genkwiz.starter.Entity.Avatar;

public interface AvatarRepository extends CrudRepository<Avatar, Integer> {

}
