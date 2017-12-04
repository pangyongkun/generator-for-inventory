<#assign className = table.className>   
<#assign classNameFirstLower = className?uncap_first>   
<#assign classNameLowerCase = className?lower_case> 

package ${basepackage}.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ${basepackage}.been.Param;
import ${basepackage}.been.${className};
import ${basepackage}.service.${className}Service;

@RestController
@RequestMapping("/vi/siyuan/${classNameLowerCase}")
public class ${className}Controller {
	
	@Autowired
	private ${className}Service ${classNameLowerCase}Service;
	
	@RequestMapping("/{id}")
	@ResponseBody
	public ${className} getUser(@PathVariable Integer id) {
		return ${classNameLowerCase}Service.select${className}ById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	@ResponseBody
	public int addOrUpdateUser(@RequestBody ${className} been) {
		if(been.get${className}Id()!=null) {
			return ${classNameLowerCase}Service.update${className}(been);
		}
		return ${classNameLowerCase}Service.insert${className}(been);
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	@ResponseBody
	public List<${className}> get${className}s(Param param) {
		return ${classNameLowerCase}Service.findPage(param);
	}

}
