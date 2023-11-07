Provides a converter between OpenAPI 2.0 and 3.0 specifications accessible via APIs and web UI. 

It is available online at https://converter.swagger.io/ and as a [docker image](https://hub.docker.com/r/swaggerapi/swagger-converter) e.g.:

```
docker pull swaggerapi/swagger-converter:v1.0.4
docker run -it -p 8080:8080 --name swagger-converter swaggerapi/swagger-converter:v1.0.4
```

Web UI is reachable at http://localhost:8080/index.html and OpenAPI spec at http://localhost:8080/api/openapi.json

## Security contact

Please disclose any security-related issues or vulnerabilities by emailing [security@swagger.io](mailto:security@swagger.io), instead of using the public issue tracker.

## License

```
Copyright 2019 SmartBear Software

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at [apache.org/licenses/LICENSE-2.0](http://www.apache.org/licenses/LICENSE-2.0)

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
