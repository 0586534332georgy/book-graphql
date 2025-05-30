query {
  allBooks {
    title
    authorSurname
    authorName
    bookGenre
  }
}

query {
  booksByGenre(bookGenre: Fantasy) {
    id
    title
    authorSurname
    authorName
    bookGenre
    pagesAmount
  }
}

query {
  booksByGenreAndPages(bookGenre: Fantasy, min: 300, max: 1000) {
    id
    title
    authorSurname
    authorName
    bookGenre
    pagesAmount
  }
}

query {
  booksByGenreAndPagesAsc(bookGenre: Fantasy, min: 300, max: 1000) {
    id
    title
    authorSurname
    authorName
    bookGenre
    pagesAmount
  }
}

query {
  freeBooks {
    title
    authorSurname
    authorName
    bookGenre
  }
}

