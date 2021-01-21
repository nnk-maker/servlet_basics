

When we got an Exception java.lang.illegalaccessException and cannot instantiate server class. 
The problem is with servlet is not able to create the object because of access modifer of class.
  To resolve these problem we need to make sure that cervlet class must be public.
  
 If we got an exception Third servlet is not a servlet. The problem is our servlet has not provided the implemtation of servlet interface.
 
 In case of weblogic server when ever we deploy the project it read the content from web.xml and check wheather
 the required classes are available in classes folder (or) not.
 If not available display an error message fail to load servlet class.
 
 When we got an Exception unsupported major minor version. The problem is with the java version of our software.
 To resolve unsupported major minor version we need to make sure that both compiler and jvm uses the same version of java.
 

