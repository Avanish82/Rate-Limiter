package com.techprimers.ratelimiter;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface InputOutPutRepo extends JpaRepository<InOutDto, Long>{

	@Query(value="{call EXEC SP_INPUTGETOUTPUT 'KUMAR','SINGH','SENT','1230987654','19-09-2023'", nativeQuery=true)
	ResponseEntity<List<InOutDto>> GetOutPutResponse(InOutDto out, int responseId);

}
