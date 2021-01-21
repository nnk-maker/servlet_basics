# servlet_basics

Whenever we deploy a project server will search for web.xml and read the content web.xml and store the content into jvm’s memory.

![](/images/Deploy_1.PNG)


In the case of the oracle WebLogic server, it is mandatory that  it check for web.xml and WEB-INF folder if not available they display a Deployment Exception.
In the case of the Tomcat server. If the file is available then the parser will check whether the XML file is available, then the parser will check web.xml is valid or not.
If it is not valid display an Error message.

Whenever the client types the URL and clicks on the enter button.
Browser takes the URL and converts that into httprequest format and sends the request to the server. 
Now the server has created 2 objects request and response objects. 
Now the server has open httprequestformat and read all the contents and store inside the request object.

![](/images/process_server_req_res.PNG)


Now server will open request and response object and take the requested resource name.
Now the server will check in the project web.xml file is there any url pattern is available which is requested by the client.
If not available server writes appropriate status code in the response object.

Now the server will read the contents from the response object and convert that into HTTPresponse object and convert that httpresponse format and send the output to the client.
Now the server will remove request and response object.

If the url pattern is available it will get the corresponding servletname for that servletname it find the servlet class name. 
Now the server takes the class name and check wheather the servlet object is available or not. 
If not vailable server will try to load the class into jvm's memory from classes folder. If the .class is not available server throws an Exception 
          Java.lang.class not found exception.


