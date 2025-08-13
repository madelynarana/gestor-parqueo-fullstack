package com.parqueo.Repository;

import com.parqueo.Models.Parqueo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParqueoRepository extends JpaRepository<Parqueo,Long> {
}
