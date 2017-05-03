# SolrAbstraction

## Requirements for the project:
1. The solr server should be started using: 
```bash 
bin/solr -e techproducts
```

This can be edited very easily in a string in SolrUtils class.

2. Use the war file provided(Solr_Abstraction.war) to upload on the clients server.
3. Using the war uploaded, a query can be sent using the following URL:

```
http://localhost:{port_Number}/SpringMVC/decisioncontroller/getquery/{query}
```

where use your desired query instead of {query} and port of server on which the war file is uploaded.

4. For Example my port number was 8080 and I queried 'a' my url would be 
```
http://localhost:8080/SpringMVC/decisioncontroller/getquery/a
```

5. This returns a json response which can be manipulated the way you want.

