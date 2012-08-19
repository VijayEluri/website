({

cache:   "org.oobium.cache.file",
modules: [
	"org.oobium.www.common_1.0.0",
	"org.oobium.www.update_site_1.0.0"
],

dev: {
	server: 5000,
	modules: [ "org.oobium.app.dev_0.6.0", "org.oobium.manager_0.6.0" ]
},

test: {
	server: 5001,
},

prod: {
	server: {
		extend: "com.oobium.www",
		host: [ "oobium.org", "www.oobium.org" ]
	}
}

});