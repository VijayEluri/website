({

cache:   "org.oobium.cache.file",

modules: [
	"org.oobium.www.common_1.0.0",
	"org.oobium.www.update_site_1.0.0"
],

dev: {
	host: "localhost",
	port: 5000,
	modules: [ "org.oobium.app.dev_0.6.0", "org.oobium.manager_0.6.0" ]
},

test: {
	host: "localhost",
	port: 5001,
},

prod: {
	host: [ "oobium.org", "www.oobium.org", "50.23.105.18" ],
	port: 80,
}

});