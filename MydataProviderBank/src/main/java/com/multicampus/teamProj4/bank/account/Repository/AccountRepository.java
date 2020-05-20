package com.multicampus.teamProj4.bank.account.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multicampus.teamProj4.bank.account.entity.AccountEntity;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long>{
	public List<AccountEntity> findByidentify(String identify);
}
