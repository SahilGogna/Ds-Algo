1. We just add spring security dependency and spring auto generates a password with a default username as 'user'.

2. 5 Spring Security Concepts :
Authentication
Authorization
Principal
Granted Authority
Roles

3. We can configure this user name and password. One way is we add the value in properties file.
Eg:
spring.security.user.name=sahil
spring.security.user.password=sahil

4. We can use Spring AuthenticationManager
a. Get hold of Authentication Manager Builder
b. Set the configuration on it

We tell Authentication Manager Builder what type of authentication we need ( eg. in memory) and the we tell username, 
password and role. It has a class that has a configure method which takes Authentication Manager Builder. We can override the method
and do the configuration.

We can also set a password encoder

5. configure Spring security Authorization
HttpSecurity object lets you configure what are the paths and access restriction on the paths.
A class should extend WebSecurityConfigurerAdapter, we can override configure method
and get hold of the HttpSecurity object.


How Spring security authentication works? 
Via filters , they directs a request to a servlet
Authentication Manager has authenticate methods and it talks to all the authentication providers in the app( o auth, ..), whichever supports
it delegates the request to that.
 _
|				-> Authentication (credentials) |
|Auth Filter    	 							| Authentication Manager(authenticate()) -> AuthenticateProvide	-> UserDetailsService
|				<- Authentication (princiapal) 	|												authenticate()		loadByUserName()
																								supports()

