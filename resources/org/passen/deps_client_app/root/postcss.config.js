/** @type {import('postcss-load-config').Config} */

module.exports = {
  plugins: {
    "@tailwindcss/postcss": {},
    autoprefixer: {},
    cssnano: {
      preset: "default",
    },
  },
};
