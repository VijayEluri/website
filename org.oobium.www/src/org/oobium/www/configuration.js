({

cache:   "org.oobium.cache.file",
session: "org.oobium.session.db",
persist: "org.oobium.persist.db.derby.embedded",
server:  "org.oobium.server",

dev: {
	host: "localhost",
	port: 5000,
	modules: "org.oobium.app.dev_1.0.0",
},

test: {
	host: "localhost",
	port: 5001,
},

prod: {
	host: "my.domain.com",
	port: 80,
}

});