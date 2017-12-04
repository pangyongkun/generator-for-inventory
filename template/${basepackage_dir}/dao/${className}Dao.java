<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>   
package ${basepackage}.dao;

import java.util.List;
import ${basepackage}.been.Param;
import ${basepackage}.been.${className};

public interface ${className}Dao {
	
	public ${className} select${className}ById(Integer id);
	public int insert(${className} been);
	public int update(${className} been);
	public int logicalDelete(Integer id);
	public int physicalDelete(Integer id);
	public List<${className}> findPage(Param param);

}
