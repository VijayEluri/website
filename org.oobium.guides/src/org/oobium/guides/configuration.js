({

modules: "org.oobium.www.common_1.0.0",

dev: {
	server: 5000,
	modules: [
		"org.oobium.app.dev_0.6.0",
		"org.oobium.manager_0.6.0"
	],
},

test: {
	server: 5001,
},

prod: {
	cache:  "org.oobium.cache.file",
	server: {
		extend: "com.oobium.www",
		host: [ "guides.oobium.org" ]
	}	
}

});
