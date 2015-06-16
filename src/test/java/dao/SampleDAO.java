package dao;

import java.util.*;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository("SampleDAO")
public class SampleDAO extends AbstractDAO{
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
		 
		
	}

}
