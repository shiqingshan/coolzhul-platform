package com.coolzhul.admin.test.persistence.mysql;

import com.coolzhul.admin.test.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestMapper extends JpaRepository <Test,Long>{
}
