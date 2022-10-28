module.exports = function (config) {
  config.set({
    listenAddress: "::",
    hostname: "127.0.0.1",
    browsers: ["jsdom"],
    reporters: ["progress"],
    basePath: "target",
    files: ["ci.js"],
    frameworks: ["cljs-test"],
    plugins: ["karma-cljs-test", "karma-jsdom-launcher"],
    colors: true,
    logLevel: config.LOG_INFO,
    client: {
      args: ["shadow.test.karma.init"],
      singleRun: true,
    },
    browserDisconnectTimeout: 300000,
    browserNoActivityTimeout: 600000,
  });
};
