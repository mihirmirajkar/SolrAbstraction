package edu.ncsu.mavenbot.controller;


import java.io.IOException;

import org.apache.solr.common.SolrDocumentList;
import org.noggit.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.ncsu.mavenbot.adapter.SolrUtil;



@Controller
@RequestMapping("/decisioncontroller")
public class DecisionMakingController {

	 
	@RequestMapping(value="/getquery/{query}", method = RequestMethod.GET)
	public @ResponseBody String getQuery(@PathVariable String query ) throws IOException {

		SolrUtil solrUtil = new SolrUtil();
		SolrDocumentList list = solrUtil.getQuery(query);
		String returnValue = JSONUtil.toJSON(list);
		System.out.println(returnValue);
		return returnValue;
		
	}

	

}

