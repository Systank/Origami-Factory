import { OrigamiFactoryAngularPage } from './app.po';

describe('origami-factory-angular App', function() {
  let page: OrigamiFactoryAngularPage;

  beforeEach(() => {
    page = new OrigamiFactoryAngularPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
