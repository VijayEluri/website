({

cache:   "org.oobium.cache.file",
persist: "org.oobium.persist.db.derby.embedded",
server:  "org.oobium.server",

modules: "org.oobium.www.common_1.0.0",

dev: {
	host: "localhost",
	port: 5000,
	modules: [
		"org.oobium.app.dev_0.6.0",
		"org.oobium.manager_0.6.0"
	],
},

test: {
	host: "localhost",
	port: 5001,
},

prod: {
	host: "guides.oobium.org",
	port: 80,
}

});
