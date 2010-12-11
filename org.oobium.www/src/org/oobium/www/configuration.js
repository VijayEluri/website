({

cache:   "org.oobium.cache.file",
session: "org.oobium.session.db",
persist: "org.oobium.persist.db.derby.embedded",
server:  "org.oobium.server",

modules: "org.oobium.www.update_site_1.0.0",

dev: {
	host: "localhost",
	port: 5000,
	modules: [ "org.oobium.app.dev_0.5.0", "org.oobium.manager_0.5.0" ]
},

test: {
	host: "localhost",
	port: 5001,
},

prod: {
	host: [ "oobium.org", "www.oobium.org" ],
	port: 80,
}

});