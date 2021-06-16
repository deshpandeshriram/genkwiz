package com.genkwiz.starter.Repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.genkwiz.starter.Entity.SessionManagement;

public interface SessionRepository extends CrudRepository<SessionManagement, UUID> {

	SessionManagement findBySessionIdEquals(UUID SessionId);

}
