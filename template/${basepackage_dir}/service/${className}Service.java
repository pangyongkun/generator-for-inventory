<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case> 
package ${basepackage}.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${basepackage}.been.Param;
import ${basepackage}.been.${className};
import ${basepackage}.dao.${className}Dao;

@Service
public class ${className}Service {
	
	@Autowired
	private ${className}Dao ${classNameFirstLower}Dao;

	public ${className} select${className}ById(Integer beenId) {
		return ${classNameFirstLower}Dao.select${className}ById(beenId);

	}

	public int insert${className}(${className} been) {
		return ${classNameFirstLower}Dao.insert(been);
	}

	public int update${className}(${className} been) {
		if (been.get${className}Id() != null && been.get${className}Id() != 0) {
			return ${classNameFirstLower}Dao.update(been);
		}
		return 0;
	}

	public int logicalDelete(Integer beenId) {
		if (beenId != null && beenId != 0) {
			return ${classNameFirstLower}Dao.logicalDelete(beenId);
		}
		return 0;
	}

	public int physicalDelete(Integer beenId) {
		if (beenId != null && beenId != 0) {
			return ${classNameFirstLower}Dao.physicalDelete(beenId);
		}
		return 0;
	}
	
	public List<${className}> findPage(Param param){
		return ${classNameFirstLower}Dao.findPage(param);
	}

}