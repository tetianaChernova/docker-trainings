Simple spring application and nginx proxy server as Docker Compose services

Run with `docker compose up --build` from the root dir (spring-app)

Task description:
- Create custom web app (it could be Python flask or any other framework up to you).
   This when we do GET to http://our_web_app/ it will show text "We are in <env_name> environment".
 - Pass env_name as env var into your web app.
 - Create Docker image for your app with multi stage build to reduce image size.
 - Add your web app in docker-compose.
     - Use env vars for <env_name> in your docker-compose
     - Use restart policy for your web app
     - Use named volume for your web app log file
     - Use named network for your web app
     - Use web profile in docker compose for your web app
     - Use env var for you web app image tag
     - Don't publish any port in your web app container

 - Add second nginx container to your docker-compose
     - use alpine nginx image which is small
     - configure nginx work as reverse proxy to your web app (your app is a backend in nginx conf)
     - nginx depends on your web app container
     - Use named volumes for nginx log files
     - Use same named network for nginx as for your web app
 - Use health checks fro both your containers
