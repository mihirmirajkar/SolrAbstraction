package edu.ncsu.mavenbot.adapter;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

public class SolrUtil {

	public SolrDocumentList getQuery(String mQueryString){
		
		System.out.println("Inside solrUtil getQuery() method........!!!"+mQueryString);
		
		String urlString = "http://localhost:8983/solr/techproducts";
		SolrClient solr = new HttpSolrClient.Builder(urlString).build();
		SolrQuery query = new SolrQuery();
		query.setQuery(mQueryString);
		try {
			QueryResponse response = solr.query(query);
			SolrDocumentList list = response.getResults();
			System.out.println("BEfore List###################################");
			return list;
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Before NULL#####################################");
		return null;
	}
}
