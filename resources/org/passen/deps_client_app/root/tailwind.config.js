/** @type {import('tailwindcss').Config} */

const { scanClojure } = require("@multiplyco/tailwind-clj");

module.exports = {
    content: {
        files: ["./src/**/*.{clj,cljs,cljc}"],
    },
    extract: {
        clj: scanClojure,
        cljs: scanClojure,
        cljc: scanClojure,
    },
    theme: {
        extend: {},
    },
    plugins: [],
};
