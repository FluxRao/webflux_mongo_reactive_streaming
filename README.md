# webflux_mongo_reactive_streaming

1. start a mongoDB server. You can use mongoDB atlas which provides 512 MB free storage - Good for the beginers
2. connect the mongoDB compass to that atlas server
3. download the code. Under the resource folder, you'll find a file named trips.json. Use this file to import data in mongodb database. It contains around 10k records
4. import the code in IDE as existing maven project
5. in application.yml file, add the connection String of mongodb atlas and database name
6. run the project as spring boot app
7. in the browser type localhost:8081/trips and see the magic
8. You'll see that the documents are loading one by one
9. The reactive mongodb will not wait for the execution to complete, but send the documents one by one - into smaller chunks 0- this is called streaming
10. Youtube and OTT platforms such as Netflix uses the same streaming APIs (not necessarily webflux) to load the video step by step

#Happy coding
