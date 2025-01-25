/** @type {import('postcss-load-config').Config} */

module.exports = {
    plugins: {
        "@tailwindcss/postcss": {},
        "postcss-prune-var": {},
        autoprefixer: {},
        cssnano: {
            preset: "default",
        },
    },
};
